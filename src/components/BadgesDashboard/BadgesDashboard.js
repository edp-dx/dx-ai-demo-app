import React, { useEffect, useState } from 'react';
import './BadgesDashboard.css';

function BadgesDashboard() {
  const [badges, setBadges] = useState([]);

  useEffect(() => {
    // Fetch badges data from API on mount
    const fetchBadges = async () => {
      try {
        const response = await fetch('/badges');
        const data = await response.json();
        setBadges(data);
      } catch (error) {
        console.error('Error fetching badges:', error);
      }
    };

    fetchBadges();
  }, []);

  return (
    <div className="badges-dashboard">
      {badges.map((badge) => (
        <div key={badge.id} className="badge-item">
          {badge.name}
        </div>
      ))}
    </div>
  );
}

export default BadgesDashboard;