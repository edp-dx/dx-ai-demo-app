import React from 'react';
import PropTypes from 'prop-types';

function BadgeItem({ badge }) {
  const handleClick = () => {
    alert(`More information about ${badge.name} badge:`);
    // Show more information logic here
  };

  return (
    <div className="badge-item" onClick={handleClick}>
      <img src={badge.imageUrl} alt={badge.name} />
      <h4>{badge.name}</h4>
      <p>{badge.criteria}</p>
    </div>
  );
}

BadgeItem.propTypes = {
  badge: PropTypes.shape({
    id: PropTypes.string.isRequired,
    name: PropTypes.string.isRequired,
    criteria: PropTypes.string,
    imageUrl: PropTypes.string,
  }).isRequired,
};

export default BadgeItem;